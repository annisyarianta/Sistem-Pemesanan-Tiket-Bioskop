public abstract class User {
    protected String nama;
    protected String email;

    public abstract void setNama(String nama);

    public abstract void setEmail(String email);

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }
}
