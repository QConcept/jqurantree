/* Copyright (C) Kais Dukes, 2009.
 * 
 * This file is part of JQuranTree.
 * 
 * JQuranTree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * JQuranTree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with JQuranTree. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jqurantree.core.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.jqurantree.core.error.Errors;
import org.junit.Test;

public class ArrayIteratorTest {

	@Test
	public void testRemoveItem() {

		// Initiate iterator.
		ArrayIterator<Integer> iterator = new ArrayIterator<Integer>(null);

		// Test that the collection is immutable.
		try {
			iterator.remove();
			fail();
		} catch (UnsupportedOperationException exception) {
			assertEquals(Errors.IMMUTABLE_COLLECTION, exception.getMessage());
		}
	}
}
