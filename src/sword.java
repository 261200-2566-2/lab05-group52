public class sword implements accessories{

    @Override
    public double getstat(human a){
        double stat=20;
        return stat;
    }
    @Override
    public double getstat(undead a){
        double stat=10;
        return stat;
    }

}//เป็นfunctionที่มีinputเป็นobject class humanและundead มีoutputเป็นค่าของstatที่เปลี่ยนแปลง เอาไว้เรียกใช้ตอนequip โดยหากใส่swordให้humanจะได้รับattackที่มากกว่าใส่ให้undead
