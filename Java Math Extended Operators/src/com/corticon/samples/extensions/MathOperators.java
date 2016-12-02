/*
 * Copyright 2016 by Progress Software Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.corticon.samples.extensions;

import java.math.BigDecimal;

import com.corticon.services.extensions.ArgumentName;
import com.corticon.services.extensions.Description;
import com.corticon.services.extensions.ICcDecimalExtension;
import com.corticon.services.extensions.OperatorFolder;
import com.corticon.services.extensions.TopLevelFolder;

/**
 * This class provides sample Corticon stand-alone extended operators. Extended
 * operators are a means to add custom features to Corticon for use in Corticon
 * rules.
 *
 * The samples in this class provide simple operators for calculating the
 * present and future value of an investment for a number of years at a given
 * interest rate.
 */
@TopLevelFolder("Math Operators")
public class MathOperators implements ICcDecimalExtension {

	/**
	 * abs
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the absolute value of a decimal value." })
	public static BigDecimal abs(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		return n.abs();
	}

	/**
	 * acos
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi." })
	public static BigDecimal acos(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.acos(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * asin
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the arc sine of a value; the returned angle is in the range -pi/2 through pi/2." })
	public static BigDecimal asin(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.asin(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * atan
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the arc tangent of a value; the returned angle is in the range -pi/2 through pi/2." })
	public static BigDecimal atan(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.atan(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * cbrt
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the cube root of a double value." })
	public static BigDecimal cbrt(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.cbrt(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * ceil
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer." })
	public static BigDecimal ceil(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.ceil(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * cos
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the trigonometric cosine of an angle." })
	public static BigDecimal cos(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.cos(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * cosh
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the hyperbolic cosine of a double value." })
	public static BigDecimal cosh(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.cosh(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * exp
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns Euler's number e raised to the power of a double value." })
	public static BigDecimal exp(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.exp(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * expm1
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns ex -1." })
	public static BigDecimal expm1(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.expm1(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * floor
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer." })
	public static BigDecimal floor(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.floor(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * exponent
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the unbiased exponent used in the representation of a double." })
	public static BigDecimal exponent(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.getExponent(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * loge
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the natural logarithm (base e) of a double value." })
	public static BigDecimal loge(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.log(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * log10
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the base 10 logarithm of a double value." })
	public static BigDecimal log10(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.log10(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

	/**
	 * log1p
	 */
	@OperatorFolder(lang = { "en" }, values = { "Decimal" })
	@Description(lang = { "en" }, values = { "Returns the natural logarithm of the sum of the argument and 1." })
	public static BigDecimal log1p(
			@ArgumentName(lang = { "en" }, values = { "n" }) BigDecimal n) {

		if (n == null)
			return null;
		double v = Math.log1p(n.doubleValue());
		return Double.isNaN(v) || Double.isInfinite(v) ? null : new BigDecimal(v);
	}

}

// Returns the absolute value of an int value.
// abs(long a)
// Returns the absolute value of a long value.
// atan2(double y, double x)
// Returns the angle theta from the conversion of rectangular coordinates (x, y)
// to polar coordinates (r, theta).
// copySign(double magnitude, double sign)
// Returns the first floating-point argument with the sign of the second
// floating-point argument.
// copySign(float magnitude, float sign)
// Returns the first floating-point argument with the sign of the second
// floating-point argument.
// hypot(double x, double y)
// Returns sqrt(x2 +y2) without intermediate overflow or underflow.
// IEEEremainder(double f1, double f2)
// Computes the remainder operation on two arguments as prescribed by the IEEE
// 754 standard.

// max(double a, double b)
// Returns the greater of two double values.
// max(float a, float b)
// Returns the greater of two float values.
// max(int a, int b)
// Returns the greater of two int values.
// max(long a, long b)
// Returns the greater of two long values.
// min(double a, double b)
// Returns the smaller of two double values.
// min(float a, float b)
// Returns the smaller of two float values.
// min(int a, int b)
// Returns the smaller of two int values.
// min(long a, long b)
// Returns the smaller of two long values.
// nextAfter(double start, double direction)
// Returns the floating-point number adjacent to the first argument in the
// direction of the second argument.
// nextAfter(float start, double direction)
// Returns the floating-point number adjacent to the first argument in the
// direction of the second argument.
// nextUp(double d)
// Returns the floating-point value adjacent to d in the direction of positive
// infinity.
// nextUp(float f)
// Returns the floating-point value adjacent to f in the direction of positive
// infinity.
// pow(double a, double b)
// Returns the value of the first argument raised to the power of the second
// argument.
// random()
// Returns a double value with a positive sign, greater than or equal to 0.0 and
// less than 1.0.
// rint(double a)
// Returns the double value that is closest in value to the argument and is
// equal to a mathematical integer.
// round(double a)
// Returns the closest long to the argument, with ties rounding up.
// round(float a)
// Returns the closest int to the argument, with ties rounding up.
// scalb(double d, int scaleFactor)
// Return d � 2scaleFactor rounded as if performed by a single correctly rounded
// floating-point multiply to a member of the double value set.
// scalb(float f, int scaleFactor)
// Return f � 2scaleFactor rounded as if performed by a single correctly rounded
// floating-point multiply to a member of the float value set.
// signum(double d)
// Returns the signum function of the argument; zero if the argument is zero,
// 1.0 if the argument is greater than zero, -1.0 if the argument is less than
// zero.
// signum(float f)
// Returns the signum function of the argument; zero if the argument is zero,
// 1.0f if the argument is greater than zero, -1.0f if the argument is less than
// zero.
// sin(double a)
// Returns the trigonometric sine of an angle.
// sinh(double x)
// Returns the hyperbolic sine of a double value.
// sqrt(double a)
// Returns the correctly rounded positive square root of a double value.
// tan(double a)
// Returns the trigonometric tangent of an angle.
// tanh(double x)
// Returns the hyperbolic tangent of a double value.
// toDegrees(double angrad)
// Converts an angle measured in radians to an approximately equivalent angle
// measured in degrees.
// toRadians(double angdeg)
// Converts an angle measured in degrees to an approximately equivalent angle
// measured in radians.
// ulp(double d)
// Returns the size of an ulp of the argument.
// ulp(float f)
// Returns the size of an ulp of the argument.
