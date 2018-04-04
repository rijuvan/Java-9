import java.util.function.Predicate;

public class  AnonClassDemoForDiamond
{
	
Predicate<Integer> predicate = new Predicate<>() {
    @Override
    public boolean test(Integer input) {
        return input == 42;
    }
};
}


