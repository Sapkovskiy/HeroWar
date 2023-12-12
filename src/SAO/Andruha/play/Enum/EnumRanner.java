package SAO.Andruha.play.Enum;

import java.util.Arrays;

public class EnumRanner {
    public static void main(String[] args) {
        ProcessorType processorType= ProcessorType.BIT_32;
        System.out.println(processorType+ "\n" + processorType.name());
        System.out.println(processorType.toString());
        System.out.println(ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_64.ordinal());
        System.out.println(ProcessorType.BIT_64.getName());
        System.out.println(processorType.getDescription());
    }
}
