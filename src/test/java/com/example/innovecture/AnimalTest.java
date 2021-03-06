ackage com.example.innovecture;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.example.innovecture.core1.Animals;
import com.example.innovecture.core.impl.Eagle;
import com.example.innovecture.core.impl.GilaMonster;
import com.example.innovecture.core.impl.Trout;
import com.example.innovecture.main.AnimalData;
import com.example.innovecture.main.core.IAnimal;
import com.example.innovecture.main.core.impl.AnimalImpl;

/**
* @author PPRAVALIKA
 * 
 * 
 */
public class AnimalTest {
	
	private IAnimal animal ;
        private Animals eagle;
	private Animals gilaMonster;
	private Animals trout;

                
	/** 
	 * @throws java.lang.Exception 
 	 */ 
 	@Before 
 	public void setUp() throws Exception { 
		animal = new AnimalImpl();
	        eagle = new Eagle();
	        gilaMonster = new GilaMonster();
		trout = new Trout();
	} 
 
 
 	/** 
 	 * @throws java.lang.Exception 
 	 */ 
 	@After 
 	public void tearDown() throws Exception { 
 		 animal = null; 
		eagle=null;
	       gilaMonster = null;
		trout=null;
 	} 

	@Test
	public void testAnimalData() {
		AnimalData a  = animal.getAnimalInformation("Cat");
		//check the Eagle habitat
		Assert.assertTrue(a.getAnimalName().equalsIgnoreCase("Cat"));
		Assert.assertTrue(a.getIsPet());
	}
	@Test
	public void testAnimalPets() {
		List<String> l1 = new ArrayList<String>();
		l1.add("cat");
		l1.add("dog");
		l1.add("Eagle");
		animal = new AnimalImpl();
		List<String> a  = animal.getAllPets(l1);
		Assert.assertEquals(a.size(), 2);

	}

	@Test
	public void testAnimals() {
		String s = eagle.habitat();
		eagle.food();
		//check the Eagle habitat
		Assert.assertFalse(eagle.isAPet());
		Assert.assertEquals(s, "Habitat of Eagle is Land");
	}

	@Test
	public void testGilaMonster() {
	        Assert.assertFalse(gilaMonster.isAPet());
		String s = gilaMonster.food();
		Assert.assertTrue(s.equalsIgnoreCase("GilaMonster is a carnivores"));

	}

	@Test
	public void testTrout() {
		String p = trout.food();
		Assert.assertTrue(p.equalsIgnoreCase("Trout is a Omnivores"));
	}

	
}
