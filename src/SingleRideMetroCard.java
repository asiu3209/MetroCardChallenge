public class SingleRideMetroCard extends MetroCard
{

    // INSTANCE VARIABLES (if any)
private boolean active;



    // CONSTRUCTOR(S)
public SingleRideMetroCard(){
    active = true;
}



    // METHODS (if any), including overridden methods
public boolean swipe(){
    if (active){
        active = false;
        return true;
    }
    return false;
}

}
