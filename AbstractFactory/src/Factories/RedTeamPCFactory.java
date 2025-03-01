package Factories;

import Products.Cpus.AbstractCpu;
import Products.Cpus.AmdCpu;
import Products.Gpus.AbstractGpu;
import Products.Gpus.AmdGpu;
import Products.Mouse.AbstractMouse;
import Products.Mouse.HyperXMouse;

public class RedTeamPCFactory extends GamingPCFactory {
    @Override
    public AbstractGpu createGPU() {
        return new AmdGpu();
    }

    @Override
    public AbstractCpu createCPU() {
        return new AmdCpu();
    }

    @Override
    public AbstractMouse createMouse() {
        return new HyperXMouse();
    }

    @Override
    public void specialMethod(){
        System.out.println("Cant really compete with top of the line");
    }
}
