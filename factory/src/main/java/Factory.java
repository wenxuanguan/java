import java.util.Objects;

public class Factory<T> {
    private Class<? extends T> clazz;

    public Factory(Class<? extends T> clazz) {
        this.clazz = Objects.requireNonNull(clazz);
    }

    public T newInstance() throws Exception {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new Exception("Unable to create instance from class[" + clazz + "].", e);
        }
    }
}
