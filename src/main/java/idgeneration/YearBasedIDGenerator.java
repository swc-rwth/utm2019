
package idgeneration;

import publications.Publication;

public class YearBasedIDGenerator extends IDGenerator {

	public String genPrefix(Publication publ) {
		return "BIB_";
	}

	public String genSuffix(Publication publ) {
		return "_" + publ.getYear();
	}
}