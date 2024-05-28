package org.poo.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Animal dog = new Dog("Terry", "correr", "guau guau!");
        dog.emitSound();
        Thread thead = new Thread(new JoseRun());
        Thread juan = new Thread(new JuanRun());

        thead.start();
        juan.start();

    }

    static class JoseRun implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("este es el hijo Jose");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    static class JuanRun implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println("Este es el hijo Juan");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
