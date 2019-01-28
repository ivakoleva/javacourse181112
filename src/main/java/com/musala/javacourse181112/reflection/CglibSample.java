package com.musala.javacourse181112.reflection;

/**
 * Created by Iva Koleva on 22.01.2019
 *
 * @see net.sf.cglib.proxy.Enhancer
 */
public class CglibSample {
    /*public static void main(final String[] args) {
        final Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(final Object obj, final Method method, final Object[] args, final MethodProxy proxy) throws Throwable {
                System.out.println("Intercepted method: " + method.getName() + " with args [" +
                        Arrays.stream(args).map(String::valueOf).collect(Collectors.joining(", ")) + "]");
                return proxy.invokeSuper(obj, args);
            }
        });

        final SampleClass sampleClass = (SampleClass) enhancer.create();
        sampleClass.setIntValue(1);
        System.out.println(sampleClass.getIntValue());
    }

    private static class SampleClass {
        private int intValue;
        private String stringValue;

        public SampleClass() {
        }

        public int getIntValue() {
            return intValue;
        }

        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }
    }*/
}
