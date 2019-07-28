
package idgeneration;

import publications.Publication;


public class SimpleIDGenerator extends IDGenerator {

	public String genPrefix(Publication publ) {
		return "BIB_";
	}

	public String genSuffix(Publication publ) {
		return "";
	}
}