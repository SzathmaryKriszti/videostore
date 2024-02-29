import {Component, OnInit} from '@angular/core';
import {VideostoreService} from "../../service/videostore.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";


@Component({
  selector: 'app-video-form',
  templateUrl: './video-form.component.html',
  styleUrls: ['./video-form.component.css']
})
export class VideoFormComponent implements OnInit {

  videoForm!: FormGroup;

  constructor(private videostoreService: VideostoreService,
              private formBuilder: FormBuilder,
              private router: Router) {

    this.videoForm = formBuilder.group({
      title: ['', Validators.required],
      director: ['', Validators.required],
      year: ['', Validators.required],
      pictureUrl: ['', Validators.required]
    })
  }

  ngOnInit(): void {
  }

  onSubmit() {
    const data = this.videoForm.value;
    this.videostoreService.createVideo(data).subscribe({
      next: () => this.router.navigate(['/']),
      error: err => console.warn(err)
    });
  }
}
