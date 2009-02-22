package org.jetbrains.plugins.clojure.psi.impl;

import org.jetbrains.plugins.clojure.psi.ClojurePsiElementImpl;
import com.intellij.lang.ASTNode;

/**
 * @author ilyas
*/
public class ClLiteral extends ClojurePsiElementImpl {
  public ClLiteral(ASTNode node) {
    super(node, "ClLiteral");
  }
}