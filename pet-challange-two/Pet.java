
public class Pet {

	private int m_age;
	private String m_name;
	private String m_type;

	Pet(int age, String name, String type) {

		m_age = age;
		m_name = name;
		m_type = type;

	}

	void set_age(int age) {

		m_age = age;
	}

	void set_name(String name) {

		m_name = name;
	}

	int get_age() {
		return m_age;
	}

	String get_name() {
		return m_name;

	}

	public void have_birthday() {
		System.out.printf("%s had a birthday!\n", m_name);
		m_age++;
		System.out.printf("%s is now %d years old\n", m_name, m_age);

	}

	public void speak() {
		String noise;

		switch(m_type) {
			case "Dog":
				noise = "Woof!";
				break;

			case "Cat":
				noise = "Meow!";
				break;
			
			case "Bird":
				noise = "Tweet!";
				break;

			default: 
				noise = "    !";

		}
		System.out.printf("%s (%s, %d years old) says: %s\n", m_name, m_type, m_age, noise);

	}

}
