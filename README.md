Mousetrap
=========

A (very small) event library for Java.

Use like:

    public class MyClass {
        public final event.Trigger<Void> somethingHappend = new event.Trigger<Void>();

        public void doSomething() {
            somethingHappened.trigger(null);
        }

        public static void main(String[] args) {
            MyClass mc = new MyClass();

            mc.somethingHappened.addListener(new event.Listener<Void>() {
                public void handle(Trigger<Void> evt, Void args) {
                    System.out.println("Something happend!");
                }
            });

            mc.doSomething();
        }
    }

# License

See the LICENCE file in the same directory as this README.

