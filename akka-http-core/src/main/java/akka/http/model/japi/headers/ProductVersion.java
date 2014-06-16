/**
 * Copyright (C) 2009-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.http.model.japi.headers;

public abstract class ProductVersion {
    public abstract String product();
    public abstract String version();
    public abstract String comment();

    public static ProductVersion create(String product, String version, String comment) {
        return new akka.http.model.headers.ProductVersion(product, version, comment);
    }
    public static ProductVersion create(String product, String version) {
        return create(product, version, "");
    }
}
