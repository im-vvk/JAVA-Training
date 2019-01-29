public class polymorpArgu {
    public static void main(String args[])
    {
        polymorpArguFat fatObject = new polymorpArguFat();
        polymorpArguTuna tunaObject = new polymorpArguTuna();
        polymorpArguTuna tuna1Object = new polymorpArguTuna1();

        //this is simply passing a tuna object as mentioned.
        fatObject.func(tunaObject);

        //this is passing of 'tuna1' object. It can be passed bcs it is subClass of 'tuna'
        fatObject.func(tuna1Object);
    }
}
