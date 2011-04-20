package by.bsu.rfe.clustering.algorithm;

import java.util.List;

import by.bsu.rfe.clustering.algorithm.cluster.Cluster;
import by.bsu.rfe.clustering.algorithm.data.DataElement;
import by.bsu.rfe.clustering.algorithm.data.DataSet;

/**
 * 
 * @author Siarhei_Yarashevich
 * 
 * @param <E>
 *          Type of {@link DataElement}
 * @param <C>
 *          Type of {@link Cluster}
 * @param <D>
 *          Type of {@link DataSet}
 */
public interface Clustering<E extends DataElement, C extends Cluster<E>, D extends DataSet<E>> {

  public List<C> cluster(D dataSet);

}