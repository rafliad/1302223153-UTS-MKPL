public class FamilyInfo {
    
    private String spouseName;
    private String spouseIdNumber;

    private List<Child> childs;
    private List<String> childIdNumbers;
    
    public FamilyInfo() {
        childs = new LinkedList<Child>();
    }
    
    public void setSpouseName(String name) {
        this.spouseName = name;
    }

    public String getSpouseName() {
        return spouseName;
    }
    
    public void setSpouseIdNumber(String idNumber) {
        this.spouseIdNumber = idNumber;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void addChild(String childName, String childIdNumber) {
        Child child = new Child(childName, childIdNumber);
        childs.add(child);
    }

    public List<Child> getChilds() {
        return childs;
    }
}