package backend.services.impl;

import backend.entities.role.Role;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RoleServiceImplSymflowerTest {
	@Test
	public void findAll1() {
		RoleServiceImpl r = null; // TODO This is a fallback value due to incomplete analysis.
		List<Role> expected = null; // TODO This is a fallback value due to incomplete analysis.
		List<Role> actual = r.findAll();

		assertEquals(expected, actual);
	}

	@Test
	public void findById2() {
		RoleServiceImpl r = null; // TODO This is a fallback value due to incomplete analysis.
		Long id = null; // TODO This is a fallback value due to incomplete analysis.
		Optional expected = null; // TODO This is a fallback value due to incomplete analysis.
		Optional actual = r.findById(id);

		assertEquals(expected, actual);
	}

	@Test
	public void save3() {
		RoleServiceImpl r = null; // TODO This is a fallback value due to incomplete analysis.
		Role role = null; // TODO This is a fallback value due to incomplete analysis.
		Role expected = null; // TODO This is a fallback value due to incomplete analysis.
		Role actual = r.save(role);

		assertEquals(expected, actual);
	}
}
