import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {VideoCreationCommandModel} from "../models/video-creation-command.model";
import {Observable} from "rxjs";

const BASE_URL = 'http://localhost:8080';

const VIDEOS_BASE_URL = BASE_URL + '/api/videos';

@Injectable({
  providedIn: 'root'
})
export class VideostoreService {

  constructor(private http: HttpClient) { }

  createVideo(data: VideoCreationCommandModel):Observable<any>{
    return this.http.post(VIDEOS_BASE_URL, data);
  }
}
