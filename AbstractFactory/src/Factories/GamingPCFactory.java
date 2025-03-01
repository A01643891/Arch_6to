package Factories;

import Products.Cpus.AbstractCpu;
import Products.Gpus.AbstractGpu;
import Products.Mouse.AbstractMouse;

abstract public class GamingPCFactory implements FactoryInterface{
    protected AbstractGpu gpu;
    protected AbstractCpu cpu;
    protected AbstractMouse mouse;

    public void buildPC(){
        gpu = createGPU();
        cpu = createCPU();
        mouse = createMouse();

        System.out.println("The components of your pc are:");
        System.out.println("GPU: " + gpu.getName());
        System.out.println("CPU: " + cpu.getName());
        System.out.println("Mouse: " + mouse.getName());
    }

    public abstract void specialMethod();
}