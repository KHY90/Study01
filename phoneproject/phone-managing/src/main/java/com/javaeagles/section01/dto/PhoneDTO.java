package main.java.com.javaeagles.section01.dto;

public class PhoneDTO {

    private String name;
    private String phone;
    private String group;
    private String memo;
    private String email;

    public PhoneDTO(){

    }

    public PhoneDTO(String name, String phone, String group, String memo, String email) {
        this.name = name;
        this.phone = phone;
        this.group = group;
        this.memo = memo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "이름 = '" + name + '\'' +
                "번호 = '" + phone + '\'' +
                "그룹 = '" + group + '\'' +
                "메모 = '" + memo + '\'' +
                "메일 = '" + email + '\'' +
                " } \n";
    }
}
