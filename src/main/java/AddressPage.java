import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.support.AbstractFindByBuilder;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public @interface AddressPage {
	  How how() default How.UNSET;

	  String using() default "";

	  String id() default "";

	  String name() default "";

	  String className() default "";

	  String css() default "";

	  String tagName() default "";

	  String linkText() default "";

	  String partialLinkText() default "";

	  String xpath() default "";

	  class FindByBuilder extends AbstractFindByBuilder {
	    @Override
	    public By buildIt(Object annotation, Field field) {
	      AddressPage findBy = (AddressPage) annotation;
	      assertValidFindBy((FindBy) findBy);

	      By ans = buildByFromShortFindBy((FindBy) findBy);
	      if (ans == null) {
	        ans = buildByFromLongFindBy((FindBy) findBy);
	      }

	      return ans;
	    }
	  }
	}