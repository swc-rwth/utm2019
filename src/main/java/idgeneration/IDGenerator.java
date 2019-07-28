package idgeneration;

import publications.Publication;

public abstract class IDGenerator {

   public String generate(Integer coun, Publication publ) {
      return (this.genPrefix(publ) + coun.toString() + this.genSuffix(publ));
   }

   public abstract String genPrefix(Publication publ);

   public abstract String genSuffix(Publication publ);
}