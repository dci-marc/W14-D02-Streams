// Java program to demonstrate functional interface

class FunctionalInterface {
    public static void main(String args[])
    {
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}
