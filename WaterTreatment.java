import java.util.ArrayList;

public class WaterTreatment {

	StringBuilder sb = new StringBuilder();


	public String grassFilter(String water) {
		sb.append(water);
		sb.append("?");
		int index =0;
		while(sb.charAt(index) != '?') {
			
			if(sb.charAt(index) == '%') {
				sb.deleteCharAt(index);
			}else {
				index++;
			}
		}
		sb.deleteCharAt(sb.length()-1);
		water = sb.toString();
		System.out.println("Water: "+water);
		sb.setLength(0);
		return water;
	}
	public String virusFilter(String water) {
		sb.append(water);
		sb.append("?");
		int index =0;
		while(sb.charAt(index) != '?') {
			
			if(sb.charAt(index) == '$') {
				sb.deleteCharAt(index);
			}else {
				index++;
			}
		}
		sb.deleteCharAt(sb.length()-1);
		water = sb.toString();
		System.out.println("Water: "+water);
		sb.setLength(0);
		return water;

	}
	public String bacteriaFilter(String water) {
		sb.append(water);
		sb.append("?");
		int index =0;
		while(sb.charAt(index) != '?') {
			
			if(sb.charAt(index) == '#') {
				sb.deleteCharAt(index);
			}else {
				index++;
			}
		}
		sb.deleteCharAt(sb.length()-1);
		water = sb.toString();
		System.out.println("Water: "+water);
		sb.setLength(0);
		return water;
	}
	public String saltFilter(String water) {
		sb.append(water);
		sb.append("?");
		int index =0;
		while(sb.charAt(index) != '?') {
			
			if(sb.charAt(index) == '&') {
				sb.deleteCharAt(index);
			}else {
				index++;
			}
		}
		sb.deleteCharAt(sb.length()-1);
		water = sb.toString();
		System.out.println("Water: "+water);
		sb.setLength(0);
		return water;
	}
	public String colorsFilter(String water) {
		sb.append(water);
		sb.append("?");
		int index =0;
		while(sb.charAt(index) != '?') {
			
			if(sb.charAt(index) == '8'|| sb.charAt(index) == '!') {
				sb.deleteCharAt(index);
			}else {
				index++;
			}
		}
		sb.deleteCharAt(sb.length()-1);
		water = sb.toString();
		System.out.println("Water: "+water);
		sb.setLength(0);
		return water;
	}
	public String sandFilter(String water) {
		sb.append(water);
		sb.append("?");
		int index =0;
		while(sb.charAt(index) != '?') {
			
			if(sb.charAt(index) == '=') {
				sb.deleteCharAt(index);
			}else {
				index++;
			}
		}
		sb.deleteCharAt(sb.length()-1);
		water = sb.toString();
		System.out.println("Water: "+water);
		sb.setLength(0);
		return water;
	}

}
