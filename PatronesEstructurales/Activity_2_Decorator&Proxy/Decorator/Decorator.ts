interface Product {
    showName(): string;

    showPrice(): number;
}

class Coffee implements Product{
    private type: string;
    private precio: number;

    constructor(type: string, precio: number) {
        this.type = type;
        this.precio = precio;
    }

    public showName(): string {
        return this.type;
    }

    public showPrice(): number {
        return this.precio;
    }
    
}

abstract class CoffeeDecorator implements Product{
    protected wrappee: Product;

    constructor(product: Product){
        this.wrappee = product;
    }
    
    public showName(): string {
        return this.wrappee.showName();
    }

    public showPrice(): number {
       return this.wrappee.showPrice();
    }    
}

class LecheDecorator extends CoffeeDecorator{

    public showName(): string {
        return(super.showName() + " + Leche");
    }

    public showPrice(): number {
        return(super.showPrice() + 1);
    }
}

class CanelaDecorator extends CoffeeDecorator{

    public showName(): string {
        return(super.showName() + " + Canela");
    }

    public showPrice(): number {
        return(super.showPrice() + 0.50);
    }
}

function main(){
    var cafe = "Espresso";
    var precio = 2;

    var finalOrder = new CanelaDecorator(new LecheDecorator(new Coffee(cafe, precio)));

    console.log("Pedido: " + finalOrder.showName());
    console.log("Precio: " + finalOrder.showPrice());
}

main()