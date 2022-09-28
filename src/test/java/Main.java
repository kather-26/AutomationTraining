class Power implements Light{
    public void lightsOn(){
        System.out.println("On");
    }
    public void lightsoff(){
        System.out.println("off");
    }

    public static void main(String[] args)
    {
        Power obj = new Power();
        obj.lightsOn();
        obj.lightsoff();
//        lightOn();
    }

}
