package com.ohmdb.basic;

/*
 * #%L
 * ohmdb-test
 * %%
 * Copyright (C) 2013 - 2014 Nikolche Mihajlovski
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.testng.annotations.Test;

import com.ohmdb.test.Book;
import com.ohmdb.test.TestCommons;

public class ClearTest extends TestCommons {

	@Test
	public void shouldClearTable() {
		initData10();

		eq(persons.size(), 10);
		eq(books.size(), 10);

		persons.clear();

		eq(persons.size(), 0);
		eq(books.size(), 10);

		Book book = books.get(10);
		isntNull(book);

		books.clear();

		eq(persons.size(), 0);
		eq(books.size(), 0);
	}

}
