public class Main {

    public static void main(String args[]) {
        worker.Worker.OnTaskDoneListener listener = System.out::println;
        worker.Worker.OnTaskErrorListener listenerError = System.out::println;
        worker.Worker worker = new worker.Worker(listener, listenerError);
        worker.start();
    }
}