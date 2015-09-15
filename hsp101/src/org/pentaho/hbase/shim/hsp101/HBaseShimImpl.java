package org.pentaho.hbase.shim.hsp101;

import org.apache.hadoop.conf.Configuration;
import org.pentaho.hadoop.shim.ShimVersion;
import org.pentaho.hbase.shim.hsp101.wrapper.HBaseShimInterface;
import org.pentaho.hbase.shim.spi.HBaseConnection;
import org.pentaho.hbase.shim.spi.HBaseShim;

public class HBaseShimImpl extends HBaseShim implements HBaseShimInterface {

  @Override
  public ShimVersion getVersion() {
    return new ShimVersion( 1, 0 );
  }

  public HBaseConnection getHBaseConnection() {
    return new HBaseConnectionImpl();
  }

  @Override
  public void setInfo( Configuration configuration ) {
    // noop
  }

}
