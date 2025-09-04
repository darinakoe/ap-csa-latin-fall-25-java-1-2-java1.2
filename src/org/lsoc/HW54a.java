public class HW54a {
  public static void main(String[] args) {
   int VW_bug_miles = 286;
   int VW_bug_gallons = 9;
   int Firebird_miles = 412;
   int Firebird_gallons = 40;
   int Subaru_miles = 361;
   int Subaru_gallons = 18;
   int Cutlass_miles = 161;
   int Cutlass_gallons = 11;
   
   int VW_bug_ave = VW_bug_miles / VW_bug_gallons ;
   int Firebird_ave = Firebird_miles / Firebird_gallons;
   int Subaru_ave = Subaru_miles / Subaru_gallons;
   int Cutlass_ave = Cutlass_miles / Cutlass_gallons;

   System.out.println(VW_bug_ave);
   System.out.println(Firebird_ave);
   System.out.println(Subaru_ave);
   System.out.println(Cutlass_ave);
  }
}