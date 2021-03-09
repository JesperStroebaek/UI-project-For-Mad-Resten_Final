package madkassen.formadresten.model;

public class Madkassen
{
    private String firstName;
    private String lastName;
    private String email;

    private String opslagstavlen;

    private String forbrugeren;
    private String virksomhed;
    private String organisation;


    // Constructer.
    public Madkassen( String firstName, String lastName, String email, String opslagstavlen, String forbrugeren, String virksomhed, String organisation)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.opslagstavlen = opslagstavlen;
        this.forbrugeren = forbrugeren;
        this.virksomhed = virksomhed;
        this.organisation = organisation;
    }

    // Getter.
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getOpslagstavlen() { return opslagstavlen; }
    public String getForbrugeren() { return forbrugeren; }
    public String getVirksomhed() { return virksomhed; }
    public String getOrganisation() { return organisation; }



}
