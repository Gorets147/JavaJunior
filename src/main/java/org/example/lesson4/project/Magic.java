package org.example.lesson4.project;




import javax.persistence.*;


@Entity
@Table(name = "test.magic")
public class Magic {

    //region Fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmagic;

    @Column(name = "название")
    private String magicname;

    @Column(name = "повреждения")
    private int magicDamage;

    @Column(name = "атака")
    private int magicAtt;

    @Column(name = "броня")
    private int magicDef;

    //endregion

    //region Constructors

    public Magic() {
    }

    public Magic(String magicname, int magicDamage, int magicAtt, int magicDef) {
        this.magicname = magicname;
        this.magicDamage = magicDamage;
        this.magicAtt = magicAtt;
        this.magicDef = magicDef;
    }

    //endregion

    //region Getters and Setters

    public String getMagicname() {
        return magicname;
    }

    public void setMagicname(String magicname) {
        this.magicname = magicname;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    //endregion

    //region Methods

    @Override
    public String toString() {
        return "Magic{" +
                "idmagic=" + idmagic +
                ", magicname='" + magicname + '\'' +
                ", magicDamage='" + magicDamage + '\'' +
                ", magicAtt='" + magicAtt + '\'' +
                '}';
    }

    //endregion
}
