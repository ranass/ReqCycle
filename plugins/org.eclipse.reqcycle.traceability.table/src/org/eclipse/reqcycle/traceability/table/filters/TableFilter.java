package org.eclipse.reqcycle.traceability.table.filters;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.reqcycle.traceability.model.Link;
import org.eclipse.reqcycle.traceability.ui.TraceabilityUtils;
import org.eclipse.reqcycle.uri.model.Reachable;

import com.google.common.collect.Iterables;


public class TableFilter extends ViewerFilter {

	private String searchString;

	public void setSearchText(String s) {
		// Search must be a substring of the existing value
		this.searchString = ".*" + s + ".*";
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if(searchString == null || searchString.length() == 0) {
			return true;
		}
		Link link = (Link)element;

		Reachable source = Iterables.get(link.getSources(), 0);
		String sourceText = TraceabilityUtils.getText(source);
		Reachable target = Iterables.get(link.getTargets(), 0);
		String targetText = TraceabilityUtils.getText(target);

		if(link.getKind().getLabel().matches(searchString)) {
			return true;
		}

		if(sourceText != null && sourceText.matches(searchString)) {
			return true;
		}
		
		if(targetText != null && targetText.matches(searchString)) {
			return true;
		}

		return false;
	}
}
