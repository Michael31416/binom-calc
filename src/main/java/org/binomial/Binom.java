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

/**
 * A class to calculate binomial coefficients.
 */
public class Binom {

    private Binom() {
        // Prevent instantiation
    }

    /**
     * Calculate the binomial coefficient.
     * @param n the number of items to choose from
     * @param k the number of items to choose
     * @return the binomial coefficient
     */
    public static long binom(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binom(n - 1, k - 1) + binom(n - 1, k);
        }
    }
}
