package HWClass18;

public class TesterTeacher {

    public static void main(String[] args) {
        MathTeacher obj1 = new MathTeacher();
        obj1.name="Oumayma";
        obj1.age=34;
        obj1.gender="female";
        obj1.Discuss();
        obj1.Encourage();
        obj1.speaking();
        obj1.polite();

        PianoTeacher obj2 = new PianoTeacher();
        obj2.name="Hichem";
        obj2.age=50;
        obj2.gender="male";
        obj2.Discuss();
        obj2.Encourage();
        obj2.speaking();
        obj2.polite();

        ChemistryTeacher obj3 = new ChemistryTeacher();
        obj3.name="Omar";
        obj3.age=11;
        obj3.gender="male";
        obj3.Discuss();
        obj3.Encourage();
        obj3.speaking();
        obj3.polite();

    }
}


