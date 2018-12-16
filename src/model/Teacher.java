package model;
public class Teacher {
    private Integer id;
    private String tno;
    private String tname;
    private String tdept;
    private String rank;
    private String phone;
    private String location;
    private String sex;
    private String type="teacher";

    public Integer getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public String getRank() {
        return rank;
    }

    public String getTdept() {
        return tdept;
    }

    public String getTname() {
        return tname;
    }

    public String getTno() {
        return tno;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setTdept(String tdept) {
        this.tdept = tdept;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
