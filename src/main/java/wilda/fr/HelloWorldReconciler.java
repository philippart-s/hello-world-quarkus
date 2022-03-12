package wilda.fr;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

public class HelloWorldReconciler implements Reconciler<HelloWorld> { 
  private final KubernetesClient client;

  public HelloWorldReconciler(KubernetesClient client) {
    this.client = client;
  }

  // TODO Fill in the rest of the reconciler

  @Override
  public UpdateControl<HelloWorld> reconcile(HelloWorld resource, Context context) {
    // TODO: fill in logic

    return UpdateControl.noUpdate();
  }
}

