import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.librarymanagement.dto.LibraryManagementDto;
import com.cg.librarymanagement.exception.LibraryManagementException;
import com.cg.librarymanagement.service.ILibraryManagementService;
import com.cg.librarymanagement.service.LibraryManagementServiceImpl;

public class TestCasesLibrary {

	private static ILibraryManagementService library = null;
	@BeforeClass
	static void setUpBeforeClass() throws LibraryManagementException {
		library  = new LibraryManagementServiceImpl();
	}

	@Test
	void testIdWhenInput() {
		LibraryManagementDto dto=library.viewDetails("aafhjf");
		assertNotNull(dto);
	}
	@Test
	void testIdWhenNoInput() {
		LibraryManagementDto dto=library.viewDetails(" ");
		assertNull(dto);
	}
	@Test
	void testAddPaymentWhenNoInputs() {
		LibraryManagementDto dto=library.payAmount("",200);
		assertNull(dto);
	}
	@Test
	void testAddPaymentWhenSpaceInput() {
		LibraryManagementDto dto=library.payAmount(" ", 2000);
		assertNull(dto);
	}
	@Test
	void testAddPaymentWhenNoInput() {
		LibraryManagementDto dto=library.payAmount("", 2000);
		assertNull(dto);
	}
	@Test
	void testAddPaymentWhenCorrectInput() {
		LibraryManagementDto dto=library.payAmount("1234", 2000);
		assertNotNull(dto);
	}

}
