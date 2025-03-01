package Factories;

import Products.Cpus.AbstractCpu;
import Products.Cpus.NvidiaCpu;
import Products.Gpus.AbstractGpu;
import Products.Gpus.NvidiaGpu;
import Products.Mouse.AbstractMouse;
import Products.Mouse.RazerMouse;

public class GreenTeamPCFactory extends GamingPCFactory{
    @Override
    public AbstractGpu createGPU() {
        return new NvidiaGpu();
    }

    @Override
    public AbstractCpu createCPU() {
        return new NvidiaCpu();
    }

    @Override
    public AbstractMouse createMouse() {
        return new RazerMouse();
    }

    @Override
    public void specialMethod(){
        System.out.println("Make sure to under produce to artificially rize prices");
    }
}
