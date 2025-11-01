/**
 *
 */
package com.bellszhu.elasticsearch.plugin.synonym.analysis;

import java.io.Closeable;
import java.io.Reader;

import org.apache.lucene.analysis.synonym.SynonymMap;

/**
 * @author bellszhu
 */
public interface SynonymFile extends Closeable {

    SynonymMap reloadSynonymMap();

    boolean isNeedReloadSynonymMap();

    Reader getReader();

}