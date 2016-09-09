/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;

/**
 *
 * @author thulasidevi
 */
public class ProfModel {
    static private String NickName;
    static private String Occupation;
    static private String Age;
    static private String Father;
    static private String Mother;
    static private String Address;
    static private String Interest;
    static private String Hobbies;
    static private String Skills;
    static private String DOB;
    static private String UserName;
    

public ProfModel(){

}
public ProfModel(String NickName,String Occupation,String Age,String Father,String Mother,String Address,String Interest,String Hobbies,String Skills,String DOB,String UserName){
    this.NickName=NickName;
    this.Occupation=Occupation;
    this.Age=Age;
    this.Father=Father;
    this.Mother=Mother;
    this.Address=Address;
    this.Interest=Interest;
    this.Hobbies=Hobbies;
    this.Skills=Skills;
    this.DOB=DOB;
    this.UserName=UserName;
}

    public static String getAddress() {
        return Address;
    }

    public static void setAddress(String Address) {
        ProfModel.Address = Address;
    }

    public static String getAge() {
        return Age;
    }

    public static void setAge(String Age) {
        ProfModel.Age = Age;
    }

    public static String getFather() {
        return Father;
    }

    public static void setFather(String Father) {
        ProfModel.Father = Father;
    }

    public static String getHobbies() {
        return Hobbies;
    }

    public static void setHobbies(String Hobbies) {
        ProfModel.Hobbies = Hobbies;
    }

    public static String getInterest() {
        return Interest;
    }

    public static void setInterest(String Interest) {
        ProfModel.Interest = Interest;
    }

    public static String getMother() {
        return Mother;
    }

    public static void setMother(String Mother) {
        ProfModel.Mother = Mother;
    }

    public static String getNickName() {
        return NickName;
    }

    public static void setNickName(String NickName) {
        ProfModel.NickName = NickName;
    }

    public static String getOccupation() {
        return Occupation;
    }

    public static void setOccupation(String Occupation) {
        ProfModel.Occupation = Occupation;
    }

    public static String getSkills() {
        return Skills;
    }

    public static void setSkills(String Skills) {
        ProfModel.Skills = Skills;
    }

    public static String getDOB() {
        return DOB;
    }

    public static void setDOB(String DOB) {
        ProfModel.DOB=DOB;
    }

    public static String getUserName() {
        return UserName;
    }

    public static void setUserName(String UserName) {
        ProfModel.UserName = UserName;
    }
}