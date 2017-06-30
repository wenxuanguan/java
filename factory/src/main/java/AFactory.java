import java.util.Objects;

public class AFactory<T extends A> {
    private Class<? extends T> clazz;

    public AFactory(Class<? extends T> clazz) {
        this.clazz = Objects.requireNonNull(clazz);
    }

    public T newA() throws Exception {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new Exception("Unable to create A with class[" + clazz + "].", e);
        }
    }
}
