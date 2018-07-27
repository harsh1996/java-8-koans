/**
 * (C) Copyright (c) 2015 Tasktop Technologies and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Holger Staudacher - initial implementation
 */
package com.tasktop.koans.java8.test;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tasktop.koans.KoanRunner;

@RunWith(KoanRunner.class)
public class AboutBase64 {

	@Test
	public void encodeToBase64() throws UnsupportedEncodingException {
		byte[] encoded = Base64.getEncoder().encode("my-string".getBytes());

		String myString = Base64.getEncoder().encodeToString("my-string".getBytes("utf-8")); // FIXME: create the string using the encoded bytes
		assertEquals("bXktc3RyaW5n", myString);
	}

	@Test
	public void decodeFromBase64() throws UnsupportedEncodingException {
		// FIXME: Where do we get an encoded string that means "my-string"? One hint... look up!
		byte[] encoded = Base64.getEncoder().encode("my-string".getBytes());

		String my = Base64.getEncoder().encodeToString("my-string".getBytes("utf-8"));
		byte[] decoded = Base64.getDecoder().decode(my.getBytes());

		String myString = new String(decoded, "utf-8");
		assertEquals("my-string", myString);
	}

}
