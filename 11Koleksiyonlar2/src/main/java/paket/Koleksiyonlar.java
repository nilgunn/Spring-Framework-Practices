package paket;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {
	List <?> lists;
	Set <?> sets;
	Map <?,?> maps;
	Properties props;
	public List<?> getLists() {
		return lists;
	}
	public void setLists(List<?> lists) {
		this.lists = lists;
	}
	public Set<?> getSets() {
		return sets;
	}
	public void setSets(Set<?> sets) {
		this.sets = sets;
	}
	public Map<?, ?> getMaps() {
		return maps;
	}
	public void setMaps(Map<?, ?> maps) {
		this.maps = maps;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Koleksiyonlar [list=" + lists 
				+ ", \nset=" + sets + ", \nmap=" + maps + ", \nprop=" + props + "]";
	}
}
