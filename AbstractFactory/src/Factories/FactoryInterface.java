package Factories;

import Products.Cpus.AbstractCpu;
import Products.Gpus.AbstractGpu;
import Products.Mouse.AbstractMouse;

public interface FactoryInterface {
    abstract AbstractGpu createGPU();
    abstract AbstractCpu createCPU();
    abstract AbstractMouse createMouse();
}
