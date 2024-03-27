/*
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.binomial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinomTest {

    @Test
    void test() {
        assertEquals(1, Binom.binom(0, 0));
        assertEquals(1, Binom.binom(1, 0));
        assertEquals(1, Binom.binom(1, 1));
        assertEquals(6, Binom.binom(4, 2));
    }

}