package com.github.rutledgepaulv.qbuilders.properties.concrete;

import com.github.rutledgepaulv.qbuilders.builders.QBuilder;
import com.github.rutledgepaulv.qbuilders.properties.virtual.NumberProperty;

/**
 * A property view for fields with {@link Double} values.
 *
 * @param <T> The type of the final builder.
 */
public interface DoubleProperty<T extends QBuilder<T>> extends NumberProperty<T, Double> {}
