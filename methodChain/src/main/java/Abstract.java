/**
 * method-chaining to provide an easy way to configure the {@link Abstract}
 */
public class Abstract<B extends Abstract<B>> {
    private String config;

    public B config(String config) {
        this.config = config;
        return (B) this;
    }
}
