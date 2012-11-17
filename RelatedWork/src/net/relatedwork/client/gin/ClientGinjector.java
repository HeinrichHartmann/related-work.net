package net.relatedwork.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import net.relatedwork.client.gin.ClientModule;
import net.relatedwork.client.staticpresenter.ImprintPresenter;

import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import net.relatedwork.client.MainPresenter;
import net.relatedwork.client.FooterPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<MainPresenter> getMainPresenter();

	AsyncProvider<FooterPresenter> getFooterPresenter();

	AsyncProvider<ImprintPresenter> getImprintPresenter();
}
