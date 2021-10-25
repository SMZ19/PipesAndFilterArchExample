
public class waterPipeline {

	public static void main(String[] args) {
		/*Este String representa todas partículas encontradas en la composición 
		 * del agua, cada está indicada con un símbolo 
		 */
		String waterParticlesFound ="&&%&88&##===##====!!!##C#888#!!##%!====%!===L%!E##&&##!88&###A&!&N##S%%888E======&====!&D===$$!W##A!%##%!8T&!##&====%E%&!!&##R#=====#88%!!&&##%####8";
		
		String waterFiltered = "";
		
		WaterTreatment waterTreatment = new WaterTreatment();
		
		waterFiltered = waterTreatment.grassFilter(waterParticlesFound);
		
		waterFiltered = waterTreatment.virusFilter(waterFiltered);
		
		waterFiltered = waterTreatment.bacteriaFilter(waterFiltered);
		
		waterFiltered = waterTreatment.saltFilter(waterFiltered);
		
		waterFiltered = waterTreatment.colorsFilter(waterFiltered);
		
		waterFiltered = waterTreatment.sandFilter(waterFiltered);
		
		System.out.println("########################################################################");
		System.out.println("Result after filters:");
		System.out.println(waterFiltered);
		System.out.println("########################################################################");
		

	}

}
